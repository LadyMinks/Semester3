const chai = require("chai");
const chaihttp = require("chai-http");
const chaijson = require("chai-json")
chai.use(chaihttp);
chai.use(chaijson);
const should = chai.should();
const expect = chai.expect;

describe('GET /list', () => {
  it('should return a list of Categories when called', done => {
    chai
      .request("http://localhost:8080")
      .get('/list')
      .end((err, res) => {
        res.should.have.status(200);
        expect(res.body).to.be.a.jsonObj();
		done();
      });
  });
});

describe('GET /list/disney_movies', () => {
  it('should return id as string, name as String and questions as jsonObj', done => {
    chai
      .request("http://localhost:8080")
      .get('/list/disney_movies')
      .end((err, res) => {
        expect(res.body.id).to.be.a('string');
		expect(res.body.name).to.be.a('string');
		expect(res.body.questions).to.be.a.jsonObj();
        done();
      });
  });
});


describe('GET /list/disney_movies', () => {
  it('should return as a jsonObj', done => {
    chai
      .request("http://localhost:8080")
      .get('/list/disney_movies')
      .end((err, res) => {
        res.should.have.status(200);
        expect(res.body).to.be.a.jsonObj();
        done();
      });
  });
});

